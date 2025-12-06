import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateArrayList {
    static void main() {
        List<Integer> listWithDuplicate= Arrays.asList(1, 2, 2, 2, 2, 4, 4, 5, 5);
        System.out.println("Original List: "+listWithDuplicate);
        List<Integer> listWithoutDuplicate= listWithDuplicate.stream().distinct().toList();
        System.out.println("Remove Duplicate: "+listWithoutDuplicate);
    }
}
