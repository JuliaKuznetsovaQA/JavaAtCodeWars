public class Block{
    int width;
    int length;
    int height;

    Block(int[] arr) {
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }

    int getWidth() {
        return width;
    }

    int getLength() {
        return length;
    }

    int getHeight() {
        return height;
    }

    int getVolume() {
        return width * length * height;
    }

    int getSurfaceArea() {
        return 2 * (width * length + length * height + height * width);
    }
}