public class Pokemon
{
  String Nombre, Genero, Color;
  int Nivel, Numero,i;
  float Peso, Tamaño;
  String[] Tipo=new String[2];
  String[] Ataques=new String[3];
  int Num_ataques, N_Tipo;
  public Pokemon()
  {
    this.Nombre=System.console().readLine("Ingrese el nombre del pokemon: ");
    this.Tipo[0]=System.console().readLine("Ingresa el tipo que tiene tu pokemon: ");
    String opc;
    opc=System.console().readLine("Tu pokemon tiene otro tipo? (si/no) ");
    if(opc.equals("si"))
    {

      this.Tipo[1]=System.console().readLine("Ingrese el segundo tipo: ");
    }
    this.Nivel=Integer.parseInt(System.console().readLine("Ingresa el nivel de tu pokemon: "));
    this.Color=System.console().readLine("Ingresa el color de tu pokemon: ");

    for(int i=0;i<4;i++)
    {      this.Ataques[i]=System.console().readLine("Ingresa el nombre del ataque "+(i+1)+": ");
    }
    this.Peso=Float.parseFloat(System.console().readLine("Ingresa el peso de tu pokemon: "));  this.Tamaño=Float.parseFloat(System.console().readLine("Ingresa el tamaño de tu pokemon: "));
    this.Genero=System.console().readLine("Ingresa el genero del pokemon: ");
  }
  public void Atacar()
  {
    String nombre_ataque;
    nombre_ataque=System.console().readLine("Ingresa el nombre del ataque que quieres usar: ");
    for(this.i=0;this.i<4;this.i++)
    {
      if(nombre_ataque.equals(this.Ataques[i]))
      {
        System.out.println("El ataque "+nombre_ataque+" ha sido elegido");
        this.i=4;
      }
    }
    if(this.i<4){
      System.out.println("El ataque no existe");
    }
  }
    
  public void Alimentar()
  {
    int Opc_Baya;
    System.out.println("-°MENU DE BAYAS°-\n1.-Baya Acardo\n2.-Baya Alcho\n3.-Baya de piña\n4.-Baya Nanab\n5.-Baya Razz");
    Opc_Baya=Integer.parseInt(System.console().readLine("Ingresa el numero de la baya que quieres utilizar: "));
    if(Opc_Baya==1)
    {
      System.out.println("Tu pokemon ha sido alimentado con una baya acardo");
    }
    else if(Opc_Baya==2)
    {
      System.out.println("Tu pokemon ha sido alimentado con una baya alcho");
    }
    else if(Opc_Baya==3)
    {
      System.out.println("Tu pokemon ha sido alimentado con una baya de piña");
    }
    else if(Opc_Baya==4)
    {
      System.out.println("Tu pokemon ha sido alimentado con una baya nanab");
    }
    else if(Opc_Baya==5)
    {
      System.out.println("Tu pokemon ha sido alimentado con una baya razz");
    }
    else
      System.out.println("La opcion seleccionada no existe");
    
  }
  public void Evolucionar()
  {
    String Opc_Evol=System.console().readLine("¿Tu pokemon tiene evolucion?(si/no)");
    if(Opc_Evol.equals("no")){
      System.out.println("\nTu pokemon no tiene mas evoluciones :( ");
       }
    else if(Opc_Evol.equals("si")){
      System.out.println("°°INGRESA LAS NUEVAS CARACTERISTICAS DE LA EVOLUCION°°");
      this.Nombre=System.console().readLine("Ingrese el nombre del pokemon: ");
      this.Tipo[0]=System.console().readLine("Ingresa el tipo que tiene tu pokemon: ");
      String opc;
      opc=System.console().readLine("Tu pokemon tiene otro tipo? (si/no) ");
      if(opc.equals("si"))
      {
          this.N_Tipo=2;
          this.Tipo[1]=System.console().readLine("Ingrese el segundo tipo: ");
        }
      else if(opc.equals("no"))
              {
              this.N_Tipo=1;
              }
        this.Nivel=Integer.parseInt(System.console().readLine("Ingresa el nivel de tu pokemon: "));
      this.Color=System.console().readLine("Ingresa el color de tu pokemon: ");
        
        for(int i=0;i<4;i++)
        {      this.Ataques[i]=System.console().readLine("Ingresa el nombre del ataque "+(i+1)+": ");
        }
        this.Peso=Float.parseFloat(System.console().readLine("Ingresa el peso de tu pokemon: "));  this.Tamaño=Float.parseFloat(System.console().readLine("Ingresa el tamaño de tu pokemon: "));
        this.Genero=System.console().readLine("Ingresa el genero del pokemon: ");

      System.out.println("\n\n!LAS NUEVAS CARACTERISTICAS DE TU POKEMON EVOLUCIONADO¡\n\n-Nombre:"+Nombre+"\n-Tipo:");

      for(int f=0;f<N_Tipo;f++)
        {
          System.out.print(Tipo[f]+" ");
          
        }
        
        System.out.println("\n-Nivel:"+Nivel+"\n-Color:"+Color+"\n-Ataques:");
        for(int i=0; i<4;i++){
        System.out.print(Ataques[i]+" ");
          
        }
      System.out.println("-Peso:"+Peso+"\n-Tamaño:"+Tamaño+"\n-Genero:"+Genero);
      }
  }
}