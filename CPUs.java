* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Treads;

/**
 *
 * @author Olli
 */
public class CPUs extends Thread {
    public int cpu;
    
    public void CPU(){
     Runtime runtime = Runtime.getRuntime();
     int cpu = runtime.availableProcessors();
     System.out.println(cpu);
      this.cpu=cpu;
    }
    
    
    public int getcpu(){
        return this.cpu;
    }
    
        
        
   
    
}
