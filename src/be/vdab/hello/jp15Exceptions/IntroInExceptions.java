package be.vdab.hello.jp15Exceptions;

public class IntroInExceptions {
    public static void main(String[] args) {
//        int result = 7/0;
//        System.out.println("result :" + result);

        // 1- voorbeeld :
        try {
            int[] array = new int[5];
            array[3] = 22;
            System.out.println(array[6]);

            float result = 7 / 0;
            System.out.println("Deze code wordt alleen uitgevoerd" + " wanneer er geen fout optreedt.");
            System.out.println(result);

        } catch (ArithmeticException ex) {
            System.out.println("Message over fout :" + ex.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Message over foute :" + e.getMessage());
        } finally {
            System.out.println("het werkt altijd ");
        }

        // 2-Voorbeeld :
        System.out.println("------------");

        try {
            String tekst = "abc";
            int tekstInGetalWaarde = Integer.parseInt(tekst);
            int result = tekstInGetalWaarde / 4;
            System.out.println(result);

        } catch (IllegalArgumentException ex) {
            System.out.println("Message over Fout :" + ex.getMessage());
        }

        // 3- Voorbeeld :
        System.out.println("--------------");

//        int[] cijfers = new int[]{12,4,5,76};
//        System.out.println("Het is 7e element is :" + cijfers[6]);

        try {
            int[] cijfers = new int[]{12, 4, 5, 76};
            System.out.println("Het is 7e element is :" + cijfers[6]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Fout message :" + e.getMessage());
        }finally {
            System.out.println("Dit is een poging voor het tonen van de"+
                    " waarde van een element.");
        }


        //4. Voorbeeld Meerdere catch blokken
        System.out.println("-----------");
//        String tekst1 = "2";
        //var tekst1 = "6";
        String tekst1 = "abc";

        try{
            var cijfers = new int[]{12,5,28,54};
            System.out.println("Element uit de array :"+ cijfers[Integer.parseInt(tekst1)]);
            System.out.println("Deze code wordt alleen uitgevoerd"+ " wanneer er geen fout optreedt.");
        }
//        catch (ArrayIndexOutOfBoundsException ex){
//            System.out.println("ArrayIndexOutOfBoundsException :"+ ex.getMessage());
//        }catch (NumberFormatException ex){
//            System.out.println("NumberFormatEXception :"+ ex.getMessage());
//        }
//        // Runtimeexception ı ilk sıraya yazsaydık ustekılerın parenti oldugu ıcın son ıkı kod hıc calısmayacaktı
//        catch (RuntimeException ex){
//            System.out.println("RunTimeException :"+ ex.getMessage());
//        }
        //2.yol Multi catch
            catch(ArrayIndexOutOfBoundsException | NumberFormatException  ex){
                System.out.println(ex.getMessage());
            } catch (RuntimeException ex){
            System.out.println(ex.getMessage());
        }

    }
}
