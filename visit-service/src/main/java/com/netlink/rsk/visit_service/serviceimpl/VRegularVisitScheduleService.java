package com.netlink.rsk.visit_service.serviceimpl;

import com.netlink.rsk.visit_service.dto.Response;
import com.netlink.rsk.visit_service.repository.VRegularVisitScheduleRepository;
import com.netlink.rsk.visit_service.service.IVRegularVisitSchedule;
import org.springframework.stereotype.Service;

@Service
public class VRegularVisitScheduleService implements IVRegularVisitSchedule {

    private final VRegularVisitScheduleRepository vRegularVisitScheduleRepository;

    VRegularVisitScheduleService(VRegularVisitScheduleRepository regularVisitScheduleRepository){
        this.vRegularVisitScheduleRepository=regularVisitScheduleRepository;
    }
    @Override
    public Response getAllRegularVisitSchedules() {
        return new Response("200","Data Fetched Successfull",vRegularVisitScheduleRepository.findAll());
    }
}
