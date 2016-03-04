import org.junit.Test;

/**
 * Created by abarabash on 3/3/16.
 */
public class PrintTriangle {



        public static void printTriangle(int height){

            printSpaces(height);


            if(height == 0){

                System.out.println("");
            }
            if(height == 1){

                printDots(height);
            }
            else{

                printTriangle(height-1);

                printDots(height);

            }

        }

        public static void printSpaces(int height){
            for(int i = 0; i < height; i++){
                System.out.print(" ");
            }
        }

        public static void printDots(int dots){


            for(int i = 0; i < dots; i++){
                System.out.print(". ");
            }
            System.out.print("\n");
        }

    @Test
    public void test001()
    {
        printTriangle(3);

    }

    }


