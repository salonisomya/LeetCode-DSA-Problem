class BrowserHistory {

    Stack<String> back = new Stack<>();
    Stack<String> move = new Stack<>();

    public BrowserHistory(String homepage) {
        back.push(homepage);
    }
    
    public void visit(String url) {
        move.clear();
        back.push(url);
    }
    
    public String back(int steps) {
        while(back.size()>1 && steps>0){
            move.push(back.peek());
            back.pop();
            steps--;
        }
        return back.peek();
    }
    
    public String forward(int steps) {
       while(!move.isEmpty() && steps> 0){
            back.push(move.peek());
            move.pop();
            steps--;
        }
        return back.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */