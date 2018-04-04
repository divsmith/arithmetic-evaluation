public class Main {

    public static void main(String[] args) {
	    StackInterface<String> ops = new StackList<>();
	    StackInterface<Double> vals = new StackList<>();

	    while (!StdIn.isEmpty())
        {
            String s = StdIn.readString();

            switch(s)
            {
                case "(":
                    break;
                case "+":
                case "*":
                    ops.push(s);
                    break;
                case ")":
                    String op = ops.pop();
                    if (op.equals("+"))
                    {
                        vals.push(vals.pop() + vals.pop());
                    }
                    else if (op.equals("*"))
                    {
                        vals.push(vals.pop() * vals.pop());
                    }
                    break;
                default:
                    vals.push(Double.parseDouble(s));
            }
        }

        System.out.println(vals.pop());
    }
}
