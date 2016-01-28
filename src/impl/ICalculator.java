package impl;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface ICalculator {
    
    public int add(int a, int b);
    
    public int multiply(int a, int b);
    
    public int divide(int a, int b);
    
    public int subtract(int a, int b);
    
}
