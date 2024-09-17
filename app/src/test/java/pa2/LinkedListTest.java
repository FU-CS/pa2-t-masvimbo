package pa2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    public class LinkedListTest {

        @Test
        void testAdd() {
            LinkedList list = new LinkedList();
            list.add(1);
            list.add(2);
            list.add(3);
            assertEquals("1 2 3 ", list.traverse());
        }
    
        @Test
        void testRemove() {
            LinkedList list = new LinkedList();
            list.add(1);
            list.add(2);
            list.add(3);
            list.remove(2);
            assertEquals("1 3 ", list.traverse());
        }
    
        @Test
        void testAddToEmptyList() {
            LinkedList list = new LinkedList();
            list.add(5);
            assertEquals("5 ", list.traverse());
        }
    
        @Test
        void testAddAsNewHead() {
            LinkedList list = new LinkedList();
            list.add(5);
            list.add(3);
            assertEquals("3 5 ", list.traverse());
        }
    
        @Test
        void testAddAtTail() {
            LinkedList list = new LinkedList();
            list.add(3);
            list.add(5);
            list.add(10);
            assertEquals("3 5 10 ", list.traverse());
        }
    
        @Test
        void testAddInMiddle() {
            LinkedList list = new LinkedList();
            list.add(3);
            list.add(10);
            list.add(7);
            assertEquals("3 7 10 ", list.traverse());
        }
    
        @Test
        void testRemoveHead() {
            LinkedList list = new LinkedList();
            list.add(3);
            list.add(5);
            list.add(7);
            list.remove(3);
            assertEquals("5 7 ", list.traverse());
        }
    
        @Test
        void testRemoveTail() {
            LinkedList list = new LinkedList();
            list.add(3);
            list.add(5);
            list.add(7);
            list.remove(7);
            assertEquals("3 5 ", list.traverse());
        }
    
        @Test
        void testRemoveMiddle() {
            LinkedList list = new LinkedList();
            list.add(3);
            list.add(5);
            list.add(7);
            list.remove(5); 
            assertEquals("3 7 ", list.traverse());
        }
    
        @Test
        void testRemoveOnlyElement() {
            LinkedList list = new LinkedList();
            list.add(5);
            list.remove(5); 
            assertEquals("", list.traverse());
        }
    
        @Test
        void testRemoveNonExistent() {
            LinkedList list = new LinkedList();
            list.add(2);
            list.add(4);
            list.remove(3); 
            assertEquals("2 4 ", list.traverse());
        }
    
        @Test
        void testTraverseEmptyList() {
            LinkedList list = new LinkedList();
            assertEquals("", list.traverse());
        }
    
        @Test
        void testTraverseSingleNode() {
            LinkedList list = new LinkedList();
            list.add(1);
            assertEquals("1 ", list.traverse());
        }
    
        @Test
        void testTraverseMultipleNodes() {
            LinkedList list = new LinkedList();
            list.add(0);
            list.add(1);
            assertEquals("0 1 ", list.traverse());
        }
    
        @Test
        void testReverseEmptyList() {
            LinkedList list = new LinkedList();
            assertEquals("", list.reverse());
        }
    
        @Test
        void testReverseSingleNode() {
            LinkedList list = new LinkedList();
            list.add(1);
            assertEquals("1", list.reverse());
        }
    
        @Test
        void testReverseMultipleNodes() {
            LinkedList list = new LinkedList();
            list.add(0);
            list.add(-1);
            assertEquals("0 -1", list.reverse());
        }
    
        @Test
        void testMergeTwoEmptyLists() {
            LinkedList list1 = new LinkedList();
            LinkedList list2 = new LinkedList();
            LinkedList merged = LinkedList.merge(list1, list2);
            assertEquals("", merged.traverse());
        }
    
        @Test
        void testMergeEmptyAndNonEmpty() {
            LinkedList list1 = new LinkedList();
            LinkedList list2 = new LinkedList();
            list1.add(2);
            list1.add(4);
            LinkedList merged = LinkedList.merge(list1, list2);
            assertEquals("2 4 ", merged.traverse());
        }
    
        @Test
        void testMergeNonOverlappingLists() {
            LinkedList list1 = new LinkedList();
            LinkedList list2 = new LinkedList();
            list1.add(2);
            list1.add(4);
            list2.add(5);
            list2.add(7);
            LinkedList merged = LinkedList.merge(list1, list2);
            assertEquals("2 4 5 7 ", merged.traverse());
        }
    
        @Test
        void testMergeOverlappingLists() {
            LinkedList list1 = new LinkedList();
            LinkedList list2 = new LinkedList();
            list1.add(4);
            list1.add(6);
            list2.add(5);
            list2.add(6);
            LinkedList merged = LinkedList.merge(list1, list2);
            assertEquals("4 5 6 6 ", merged.traverse());
        }
    }
    
        