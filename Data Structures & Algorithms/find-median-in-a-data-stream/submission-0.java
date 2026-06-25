class MedianFinder {

    PriorityQueue<Integer> min;
    PriorityQueue<Integer> max;

    public MedianFinder() {
        // For larger Elements
        min = new PriorityQueue<>();
        // For smaller Elements
        max = new PriorityQueue<>((a,b) -> b-a);
    }
    
    public void addNum(int num) {
        max.add(num);
        
        min.add(max.poll());

        if(min.size() > max.size()){
            max.add(min.poll());
        }
    }
    
    public double findMedian() {
        if(min.size() == max.size()){
            return (max.peek() + min.peek() ) / 2.0;
        }else{
            return max.peek();
        }
    }
}
