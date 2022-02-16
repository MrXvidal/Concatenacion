
package exercici.pkg5;

public class CEmpleat {
   
    //Llista d'Atributs
    private String cognom1;
    private String cognom2;
    private String estat;
    private int nfills;
    private String data;
    private float salari;
    private int categoria;
    
    public String getcognom1 ()
    {
        return this.cognom1;
    }
    
    public String getcognom2 ()
    {
        return this.cognom2;
    }

    public String getestat ()
    {
        return this.estat;
    }
    
    public int getnfills ()
    {
        return this.nfills;
    }
    
    public String getdata ()
    {
        return this.data;
    }
    
    public float getsalari ()
    {
        return this.salari; 
    }
    
    public int setcategoria ()
    {
        return this. categoria;
    }
    
    public void setCognom1(String cognom1)
    {
        this.cognom1 = cognom1;
    }
    
    public void setCognom2(String cognom2)
    {
        this.cognom2 = cognom2;
    }
    
    public void setEstat(String estat)
    {
        this.estat = estat;
    }
    
    public void setNfills(int nfills)
    {
        this.nfills = nfills;
    }
    
    public void setData(String data)
    {
        this.data = data;
    }
    
    public void setSalari (float salari)
    {
        this.salari = salari; 
    }
    
    public void setCategoria (int categoria)
    {
        this.categoria = categoria;
    }
    
    public void messou(float p) {
        salari=salari+(salari*p)/100;
    }  
    
    public void messou(float p, float p2) {
        salari=salari+(salari*(p+p2))/100;
    }   
}
