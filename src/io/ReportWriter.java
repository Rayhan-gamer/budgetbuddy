package io;
import model.Expense;
import service.ExpenseRepository;
import service.Summarizer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public abstract class ReportWriter {
    
    public void writeReport(String filePath, ExpenseRepository repository) throws IOException{
        
    }
}
