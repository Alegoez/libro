//clase principal
public class librerias{

    //metodo principal
    public static void Main(string[] args){
        //define una istancia de libreria como cienaños y la inicialiso como nueva
libro Cienaños= new libro();
Cienaños.setautor("gabriel garcia");
Cienaños.setnumerdepaginas(496);
Cienaños.setISBN(134527);
Cienaños.setlibro("Cienaños años de soledad");
Cienaños.ToString();

//define una istancia de libreria como pinocho y la inicialiso como nueva 
libro caperucita= new libro();
//configurar autor
caperucita.setautor("charles");
//configurar pagina 
caperucita.setnumerdepaginas(24); 
//configurar ISBN
caperucita.setISBN(334265);
//lee unos valores, los combierte y los muestra en pantalla
Cienaños.tostring();
//lee unos valores, los combierte y los muestra en pantalla
caperucita.tostring();

    //condicional si
      if(Cienaños.getnumerodepaginas()>=caperucita.getnumerodepaginas()) {
        //muestra en pantalla cien años tiene mas pagina 
         Console.WriteLine ("cien años tiene mas paginas");
      }
      //condicional sino
        else{

        //muestra en pantalla pinocho tiene mas pagina 
          Console.WriteLine("pinocho tiene mas paginas");
        
      }
    
    }
}