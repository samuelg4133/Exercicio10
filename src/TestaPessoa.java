public class TestaPessoa {
    
    public static void main(String []args){
    
    try {
    
    Pessoa p1 = new Pessoa("Samuel", 4) {} ;
     Pessoa p2 = new Pessoa("Samuel", -4) {};
    
    }catch(IdadeInvalidaException exc){
    
        System.out.println(exc.getMessage());
    }
    
    
    
    }
}
