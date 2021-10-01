package _23_behavioral_design_pattern.practice.sort;

import java.util.List;

public interface SortStrategy {

    <T> void sort(List<T> items);
}
