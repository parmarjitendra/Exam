package dslab1.sech.main.myinterface;

import dslab1.sech.main.myinterface.MyArrayADTInterface.;

public class MyArrayADT implements MyArrayADTinterface {
    private int[] data;
    private int end;
    private int size;
    
    //constructor
    public MyArrayADT(int size){
        this.size = size;
        data = new int[this.size];
        end=0;
    }

    @Override
    public boolean insert(int element) {
        boolean response = false;
        if(isFull()){
        if(end != size)
            data[end] = element;
            response = true;
            
        }
        return response;
        
    }
    public boolean isFull(){
        boolean response = false;
        if(end == size){
            response = true;
        }
        return response;
    }

    @Override
    public void traverse() {
        System.out.println("printing element.......");
        for (int i = 0; i < end ; i++) {
            System.out.print(data[i]);
            if(i < end-1){
                System.out.print(",");
            }
            
        }
        System.out.println();
    }

    @Override
    public int delete() {
        int response = 0;
        if(isEmpty()){
            end--;
            response = data[end];
        }
        return response;
    }
    public boolean isEmpty() {
        boolean response = false;
        if(end == 0){
            response = true;
        }

        return response;
    }

    @Override
    public boolean search(int element) {
        boolean response = false;
        for (int i = 0; i < end ; i++) {
            if(data[i] == element){
                response = true;
            }

        }
        return response;
    }

    @Override
    //bubble  sort
    public int[] sort() {
        return new int[0];
    }
}

