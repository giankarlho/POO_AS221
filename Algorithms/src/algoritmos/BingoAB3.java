package algoritmos;

public class BingoAB3 {    
    
    public static void main(String[] args) {
        
        int fila[] = new int[5];
                
        fila[0] = (int)(Math.random()*15) + 1;  // 1 - 15
        fila[1] = (int)(Math.random()*15) + 16; // 16 - 30
        fila[2] = (int)(Math.random()*15) + 31; // 31 - 45        
        fila[3] = (int)(Math.random()*15) + 46; // 46 - 60
        fila[4] = (int)(Math.random()*15) + 61; // 61 - 75
        
        for (int i=0; i<5 ; i++){
            System.out.print(fila[i] + "\t");
        }       
            
    }
    
}
