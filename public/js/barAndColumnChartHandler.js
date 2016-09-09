$(function () {

	$('#barStackedChart').highcharts({
        chart: {
            type: 'bar'
        },
        title: {
            text: 'Stacked bar chart'
        },
        xAxis: {
            categories: ['Happiness', 'Crave', 'Gratirude', 'positive_unclassified', 'Frustration', 'Anger']
        },
        yAxis: {
            min: 0,
            title: {
                text: null
            }
        },
        legend: {
            backgroundColor: '#FFFFFF',
            reversed: true
        },
        plotOptions: {
            series: {
                stacking: 'normal'
            }
        },
            series: [{
            name: 'positive',
            data: [5, 3, 4, 7, 2, 10]
        }, {
            name: 'negative',
            data: [2, 2, 3, 2, 1, 1]
        }, {
            name: 'surprise_shock',
            data: [3, 4, 4, 2, 5, 7]
        }, {
            name: 'neutral',
            data: [3, 4, 4, 2, 5, 3]
        }]
    });
});
	
	
	var populateColumnChart = function(categoryvalue) {
	$('#columnChart').highcharts({
        chart: {
            type: 'column'
        },
        title: {
            text: 'World\'s largest cities per 2014'
        },
        subtitle: {
            text: 'Source: <a href="http://en.wikipedia.org/wiki/List_of_cities_proper_by_population">Wikipedia</a>'
        },
        xAxis: {
            type: 'category',
            labels: {
                rotation: -45,
                style: {
                    fontSize: '13px',
                    fontFamily: 'Verdana, sans-serif'
                }
            }
        },
        yAxis: {
            min: 0,
            title: {
                text: 'Population (millions)'
            }
        },
        legend: {
            enabled: false
        },
        tooltip: {
            pointFormat: 'Population in 2008: <b>{point.y:.1f} millions</b>'
        },
        series: [{
            name: 'Population',
            data:  processData(categoryvalue),
            dataLabels: {
                enabled: true,
                rotation: -90,
                color: '#FFFFFF',
                align: 'right',
                format: '{point.y:.1f}', // one decimal
                y: 10, // 10 pixels down from the top
                style: {
                    fontSize: '13px',
                    fontFamily: 'Verdana, sans-serif'
                }
            }
        }]
    });
}

var processData = function(data) {
    var result = data.map((item) => {
        return [
            item['name'],
            item['value'],
        ]
    });
    return result;
}

var populateBarChart = function(categories, data) {
        $('#barChart').highcharts({
                chart: {
                    type: 'column'
                },
                title: {
                    text: null
                },
                subtitle: {
                    text: null
                },
                xAxis: {
                    categories: categories,
                    title: {
                        text: null
                    }
                },
                yAxis: {
                	min: 1,
                    type: 'logarithmic',
                    endOnTick: true,
                    tickInterval: 1,
                    minorTickInterval: 10,
                    gridLineWidth: 0.1,
                    //min: 0,
                    title: {
                        text: null,
                        align: 'high'
                    },
                    labels: {
                        overflow: 'justify'
                    }
                },
                tooltip: {
                    valueSuffix: ' millions'
                },
                plotOptions: {
                    bar: {
                        dataLabels: {
                            enabled: true
                        }
                    }
                },
                legend: {
                    layout: 'vertical',
                    align: 'right',
                    verticalAlign: 'top',
                    x: -40,
                    y: 100,
                    floating: true,
                    borderWidth: 1,
                    backgroundColor: '#FFFFFF',
                    shadow: true
                },
                credits: {
                    enabled: false
                },
                series: data
            });
   }
