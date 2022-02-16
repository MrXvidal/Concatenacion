
package exercici.pkg5;

public class CTestEmpleat {
    
public static void main(String[] args) {
        
        
         CEmpleat empleat1 = new CEmpleat();
        
         empleat1.setCognom1("Vidal");
         empleat1.setCognom2("Xavi");
         empleat1.setEstat("Solter");
         empleat1.setNfills(1);
         empleat1.setData("15/05/1989");
         empleat1.setSalari(1500);
         empleat1.setCategoria(2);
         
         
         
         System.out.println("Primer Cognom empleat: "+ empleat1.getcognom1()+ 
                            ". Segon Cognom empleat: " + empleat1.getcognom2()+ 
                            ". Salari:  " + empleat1.getsalari()+"E");
         
        empleat1.messou(10,empleat1.getnfills());
         
         System.out.println("Primer Cognom empleat: "+ empleat1.getcognom1()+ 
                            ". Segon Cognom empleat: " + empleat1.getcognom2()+ 
                            ". Salari Incrementat: "+ empleat1.getsalari()+"E");
         
}
    
}
