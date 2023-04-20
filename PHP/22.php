<!-- 22.Calculate the difference between two dates using PHP OOP approach. -->


<?php
class DateDiff {
    private $date1;
    private $date2;

    public function __construct($date1, $date2) {
        $this->date1 = new DateTime($date1);
        $this->date2 = new DateTime($date2);
    }

    public function diff() {
        $interval = $this->date1->diff($this->date2);

        return [
            $interval->y, 
            $interval->m, 
            $interval->d
        ];
    }
}

$date1 = '1981-11-03';
$date2 = '2013-09-04';

$dateDiff = new DateDiff($date1, $date2);
[$years_diff, $months_diff, $days_diff] = $dateDiff->diff();

echo "Difference: " . $years_diff . " years, " . $months_diff . " months, " . $days_diff . " days";
?>
