class StringBufferCapacity {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb1 = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb1.capacity());
    }
}

// Reference datatype value always stored in a heap memory