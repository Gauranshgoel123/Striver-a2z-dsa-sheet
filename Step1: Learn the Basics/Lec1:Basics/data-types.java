class Solution{
  publlic int size(String dataType){
    switch (dataType) {
            case "Character":
                return Character.BYTES;
            case "Integer":
                return Integer.BYTES;
            case "Long":
                return Long.BYTES;
            case "Float":
                return Float.BYTES;
            case "Double":
                return Double.BYTES;
            default:
                return -1; 
        }
    }
}
    
