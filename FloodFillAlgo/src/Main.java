public class Main {
    public static int[][] floodFill(int[][] image, int sr, int sc, int nc){
        if (image[sr][sc] == nc){
            return image;
        }

        fill(image[sr][sc], image, sr, sc, nc);

        return image;
    }

    public static void fill(int match, int[][] image, int r, int c, int nc){
        if (0 <= r && r < image.length && 0 <= c && c < image[r].length){
            if (image[r][c] >=0 && image[r][c] == match){
                image[r][c] = nc;

                if (0 <= (r - 1) && (r - 1) < image.length){
                    fill(match, image, (r - 1), c, nc);
                }

                fill(match, image, r, c - 1, nc);

                if (0 <= (r + 1) && (r + 1) < image.length){
                    fill(match, image, (r + 1), c, nc);
                }

                fill(match, image, r, c + 1, nc);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}