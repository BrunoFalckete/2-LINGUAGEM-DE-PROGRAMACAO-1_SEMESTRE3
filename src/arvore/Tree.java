package lp.arvore;

public class Tree {

  Node root = null;

  public void inserir(int info, Node node){
    if(node == null){
      root = new Node(info);
      // System.out.println("Criando a árvore...!\nroot = " + root.info);
      return;
    } 
    if(node.info > info){
      // inserir a esq
      if(node.esq == null){
        node.esq = new Node(info);
        return;
      }
      // func. recursiva 
      inserir(info, node.esq);

    } else {
      // inserir a dir
      if(node.dir == null){
        node.dir = new Node(info);
        return;
      }

      inserir(info, node.dir);
    }

    

  }

  public boolean isNode(Node n){
    return n != null;
  }

  public boolean procurar(Node node, int valor, boolean found){
    boolean retorno = found;
    // procurar pelo elemento na arvore
    // qdo achar, imprimir se tem filhos e quais são seus filhos
    if(node == null){
      System.out.println("Árvore Vazia!");      
      return false;
    }

    if(valor == node.info){
      System.out.println("Elemento encontrado!");
      int qto = 0, fEsq = 0, fDir = 0;
      if(node.esq != null){
        qto++;
        fEsq = node.esq.info;      }
      if(node.dir != null){
        qto++;
        fDir = node.dir.info;
      }

      System.out.println("O elemento " +
                        node.info + " tem " + 
                        qto + " filhos\n");

      if(fEsq != 0) System.out.println("Filho esq: " + fEsq);
      if(fDir != 0) System.out.println("Filho dir: " + fDir);

      return true;

    } 
    
    if(isNode(node.esq))
      retorno = procurar(node.esq, valor, retorno);
    
    if(isNode(node.dir))
      retorno = procurar(node.dir, valor, retorno);

  return retorno;

  }

  public void pre_ordem(Node node){
    if(node == null){
      System.out.println("Árvore Vazia!");
      return;
    }

    System.out.println(node.info);
    if(isNode(node.esq))
      pre_ordem(node.esq);
    
    if(isNode(node.dir))
      pre_ordem(node.dir);
    

  }

  public void in_ordem(Node node){
     if(node == null){
      System.out.println("Árvore Vazia!");
      return;
    }

    if(isNode(node.esq))
      pre_ordem(node.esq);

    System.out.println(node.info);
    
    if(isNode(node.dir))
      pre_ordem(node.dir);
  }

  public void pos_ordem(Node node){
     if(node == null){
      System.out.println("Árvore Vazia!");
      return;
    }

    if(isNode(node.esq))
      pre_ordem(node.esq);
    
    if(isNode(node.dir))
      pre_ordem(node.dir);

    System.out.println(node.info);
  }




    public void print(String prefix, Node n, boolean isLeft) {
        if (n != null) {
          print(prefix + "     ", n.dir, false);
          System.out.println (prefix + ("|--> ") + n.info);
          print(prefix + "     ", n.esq, true);
      }
    }

  @Override
  public String toString() {
    // this.in_ordem(root); // creditos by leticia novamente!!!
    this.print("", this.root, false);
    return "";
  }
  
}
