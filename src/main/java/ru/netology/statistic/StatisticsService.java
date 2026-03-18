package ru.netology.statistic;

public class StatisticsService {
  /**
   * Calculate, index of max income
   *
   * @param incomes - array of incomes
   * @return - index of first max value
   */
  public long findMax(long[] incomes) {
    long current_max_index = 0;
    long current_max = incomes[0];
    for (int i = 0; i < incomes.length; i++) {
      if (current_max < incomes[i]) {
        current_max = incomes[i];
        current_max_index = i;
      }
    }

    return current_max_index;
  }
}
