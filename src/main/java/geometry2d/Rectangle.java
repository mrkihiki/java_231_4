package geometry2d;

import exceptions.VariablesLesThanZeroException;
import exceptions.VariablesNotSetException;

public class Rectangle implements Figure {
    private float width;
    private float height;

    public Rectangle(int width, int height) {
        if(width<0 && height<0){
            throw new VariablesLesThanZeroException("width","height",this.width,this.height);
        }else if(width<0){
            throw new VariablesLesThanZeroException("width",this.width);
        }else if(height<0){
            throw new VariablesLesThanZeroException("height",this.height);
        }
        this.width=width;
        this.height=height;
    }
    public void setWidth(float width){
        if(height<0){
            throw new VariablesLesThanZeroException("height",this.height);
        }
        if(width==0){
            throw new VariablesNotSetException("width,height");
        }
        this.width= width;
    }
    public void setHeight(float height){
       if(height<0){
            throw new VariablesLesThanZeroException("height",this.height);
        }
        if(height==0){
            throw new VariablesNotSetException("width,height");
        }
        this.height= height;
    }
    public float area() {
        return width * height;
    }
    public float perimeter() {
        return (width + height)*2;
    }
    public String toString(){
        return "width = "+width+";height = "+height+"; area = "+area()+";perimeter = "+perimeter()+";";
    }
}
