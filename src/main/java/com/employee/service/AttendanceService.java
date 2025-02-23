package com.employee.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.employee.entity.Attendance;
import com.baomidou.mybatisplus.extension.service.IService;
import com.employee.entity.vo.AttendanceQueryVo;

/**
 * <p>
 * 考勤表 服务类
 * </p>
 *
 * @author rabbiter
 * @since 2022-12-14
 */
public interface AttendanceService extends IService<Attendance> {

    IPage<Attendance> pageListQuery(Page<Attendance> attendancePage, AttendanceQueryVo attendanceQueryVo);
}
