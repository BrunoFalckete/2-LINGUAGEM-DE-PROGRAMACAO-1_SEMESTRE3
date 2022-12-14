package lp.arvore;

public class Node {

  int info;
  Node esq;
  Node dir;

  public Node(int info){
    this.info = info;
    this.esq = null;
    this.dir = null;
  }


}