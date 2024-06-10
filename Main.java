class Main {
  public static void main(String[] args) {
    Pokemon chalan=new Pokemon();
    int opc=Integer.parseInt(System.console().readLine("\nEscribe el numero de la opcion que quieres hacer con tu pokemon: \n1.-Atacar\n2.-Alimentar\n3.-Evolucionar"));
    if(opc==1)
    {
      chalan.Atacar();
    }
    else if(opc==2)
    {
      chalan.Alimentar();
    }
    else if(opc==3)
    {
      chalan.Evolucionar();
    }
  }
}