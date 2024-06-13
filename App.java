import java.util.ArrayList;
import java.util.Scanner;

public class App {


    public static Scanner leer = new Scanner(System.in);
    public static ArrayList <Producto> productos = new ArrayList<Producto>();


    public static void main(String[] args) throws Exception {

        boolean salir = true;


        do {

            System.out.println("Seleccione una opcion. ");
            System.out.println("1.Agregar. ");
            System.out.println("2.Mostrar Catalogo. ");
            System.out.println("3.Buscar");
            System.out.println("4.Modificar");
            System.out.println("5.Eliminar");
            System.out.println("6.Salir");
            int op = leer.nextInt();
            leer.nextLine();


            switch (op) {
                case 1:
                AddProduct();
                    break;
                case 2:
                MostrarCatalogo();
                    break;
                case 3:
                buscarProducto();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                salir = false;
                    break;
                default:
                    break;
            }
            
        } while (salir);


    }
    public static void AddProduct(){

        System.out.println("Ingresa el codigo del producto. ");
        CodProd = leer.nextInt();
        System.out.println("Ingresa el Nombre del Producto. ");
        nombre = leer.nextLine();
        System.out.println("Ingresa el Precio del Producto. ");
        precio = leer.nextDouble();
        System.out.println("Ingresa el Costo del Producto. ");
        getCosto = leer.nextDouble();
        System.out.println("Ingresa la Descripcion del producto. ");
        descripcion = leer.nextLine();

    }
    public static void MostrarCatalogo(){
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    public static void buscarProducto() {
        System.out.println("Ingrese el Codigo de producto a Buscar. ");
        CodBus = leer.nextInt();

        for (Producto producto : productos) {
            if (producto.CodProd() == CodBus) {
                System.out.println("El Producto es: ");
                System.out.println(producto);
                return;
                
            } else{
                System.out.println("Producto no encontrado. ");
            }
            
        }
    }
}
