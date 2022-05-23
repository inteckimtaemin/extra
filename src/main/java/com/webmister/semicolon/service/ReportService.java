package com.webmister.semicolon.service;

import com.webmister.semicolon.domain.Report;
import com.webmister.semicolon.repository.ReportRepository;
import com.webmister.semicolon.request.UploadRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    @Autowired
    ReportRepository reportRepository;

    public Boolean reportUpload(UploadRequest uploadRequest){
        try{
            reportRepository.save(Report.builder()
                    .title(uploadRequest.getTitle())
                    .contents(uploadRequest.getContents())
                    .likeCount(uploadRequest.getLikeCount())
                    .reportImageUrl(uploadRequest.getReportImageUrl())
                    .build());
            return Boolean.TRUE;
        }catch (Exception e){
            return Boolean.FALSE;
        }
    }


}
