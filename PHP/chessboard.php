<table width="300px" cellspacing="0px" cellpadding="1px" border="1px">

    <?php 
        for ($row = 1; $row <= 8; $row++) {
            echo "<tr>";
            for ($col = 1; $col <= 8; $col++) {
                if (($row + $col) % 2 == 0) {
                    echo "<td width=30px height=30px bgcolor=#FFFFFF> </td>";
                }
                else {
                    echo "<td width=30px height=30px bgcolor=#000000> </td>";
                }
            }
            echo "</tr>";
        }
    ?>

</table>
