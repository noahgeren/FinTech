package org.hackku.fintech.services;

import org.hackku.fintech.dao.DailyReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DailyReportService {
	
	@Autowired
	DailyReportRepository reportRepo;

}