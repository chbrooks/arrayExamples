import java.util.Arrays;

public class safeIntArrayTemplate {
    import java.util.Arrays;

    public class safeIntArray {

        int[] internalArray;
        int internalSize;

        public safeIntArray(int initialSize) {
            this.internalArray = new int[initialSize];
            this.internalSize = 0;
        }

        /* default size - 10 */
        public safeIntArray() {
            this.internalArray = new int[10];
            this.internalSize = 0;
        }

        @Override
        public String toString() {
            return Arrays.toString(internalArray);
        }

        /* add the value val at the end of the array.
         * If the array is full, create a new array of 2x size, and copy everything there. */
        public void add(int val) {

        }

        /* set array[index] = val */
        public void set(int index, int val) {

        }

        /* get the value at index */
        public int get(int index) {

        }

        /* return true if val is in the array */
        public boolean contains(int val) {

        }

        /* return the index where val is stored, or -1 if it's not present. */
        public int indexOf(int val) {

        }

        /* remove the element at index. *
           slide all elements in the array down.
         */
        public void remove(int index) {

        }

        public int size() {
            return internalSize;
        }
    }

}
