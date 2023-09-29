var days = [
    {day: 'sunday',hours :2},
    {day: 'Monday',hours :8},
    {day: 'Tuesday',hours :7}
]

    days.forEach(function(item) {
        console.log(item);

    })

    var resultDays = days.filter (function(item)
    {
            return true;
    }
    );
    console.log(resultDays);

    var effort8Hours = days.filter (function(item)
    {
            return item.hours >= 8;
    }
    );
    console.log(effort8Hours);