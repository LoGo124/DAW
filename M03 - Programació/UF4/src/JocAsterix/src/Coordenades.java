public class Coordenades {
    private int x;
    private int y;
    //private int z;
    
    public Coordenades(){
        this.x = 0;
        this.y = 0;
        //this.z = 0;
    }

    public Coordenades(int x, int y){  // public Coordenades(int x, int y, int z){  // Posible millora
        this.x = x;
        this.y = y;
        //this.z = z;
    }

    public Coordenades(int minX, int maxX, int minY, int maxY){  // public Coordenades(int minX, int maxX, int minY, int maxY, int minZ,int maxZ){  // Posible millora
       this.x = minX + (Math.random() * (maxX - minX) + 1);
       this.y = minY + (Math.random() * (maxY - minY) + 1);
       //this.z = minZ + (Math.random() * (maxZ - minZ) + 1);
    }
}