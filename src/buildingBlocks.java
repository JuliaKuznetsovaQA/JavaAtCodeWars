public class buildingBlocks {
    public static void main(String[] args) {

        Block block = new Block(new int[]{2,3,5});
        System.out.println(block.getHeight());
        System.out.println(block.getLength());
        System.out.println(block.getWidth());
        System.out.println(block.getVolume());
        System.out.println(block.getSurfaceArea());

    }
}
