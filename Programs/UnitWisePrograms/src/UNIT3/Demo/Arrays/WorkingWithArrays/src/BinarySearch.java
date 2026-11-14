class BinarySearch {
    int binarySearch(int a[],int x)
    {
        int l=0; int r=a.length-1;
		while (l <= r) {
            int m = (l + r) / 2;
            // Index of Element Returned
            if (a[m] == x) {
                return m;
            // If element is smaller than mid, then
            // it can only be present in left subarray
            // so we decrease our r pointer to mid - 1 
            } else if (a[m] > x) {
                r = m - 1;
            // Else the element can only be present
            // in right subarray
            // so we increase our l pointer to mid + 1
            } else {
              l = m + 1;
            }  
        }
        // No Element Found
        return -1;
    }
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int a[] = { 2, 3, 4, 10, 40 };
        int n = a.length;
        int x = 10;
        int res = ob.binarySearch(a, x);
        if (res == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + res);
    }
}