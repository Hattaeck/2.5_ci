package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 0;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }

  @Test
  void findMaxWhenFirstElementIsMax() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {10, 6, 2};
    long expected = 0;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }

  @Test
  void findTrue() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {3, 8, 14};
    long expected = 2;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }

}