package com.dhenton9000.env.properties.sample;

public class SpringSample {

    private ReportService reporterService;

    public String report() {
        return reporterService.report();
    }

    public void setReportService(ReportService reportService) {
        this.reporterService = reportService;
    }

}
