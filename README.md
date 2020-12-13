# OrderedArrayList

Group Discussion
• We talked about how the NoNullArrayList methods would work (throw the exception if null and then call super.MethodName(arguments) if the input isn't null) and how to override them
• For OrderedArrayList, for the add method, you can call a helper method and then add the value at that index
• the helper method would loop through the list until you find a value that's greater than the one you want to input, and the index that is returned is the one right before the index of the value that's greater than it. You can use compareTo to compare the values.
• the add method would then add the value at that index that was found from the helper method
• for the set method, first you can call the remove method (from the parent class) and then call the add method that was just written (from this class)
