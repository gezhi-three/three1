package cn.gezhi.service.Impl;

import cn.gezhi.mapper.PositionMapper;
import cn.gezhi.po.Position;
import cn.gezhi.po.PositionExample;
import cn.gezhi.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PositionServiceImpl implements PositionService {
    @Autowired
    private PositionMapper positionMapper;
    @Override
    public int countByExample(PositionExample example) {
        return positionMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(PositionExample example) {
        return positionMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer positionId) {
        return positionMapper.deleteByPrimaryKey(positionId);
    }

    @Override
    public int insert(Position record) {
        return positionMapper.insert(record);
    }

    @Override
    public int insertSelective(Position record) {
        return positionMapper.insertSelective(record);
    }

    @Override
    public List<Position> selectByExample(PositionExample example) {
        return positionMapper.selectByExample(example);
    }

    @Override
    public Position selectByPrimaryKey(Integer positionId) {
        return positionMapper.selectByPrimaryKey(positionId);
    }

    @Override
    public int updateByExampleSelective(Position record, PositionExample example) {
        return positionMapper.updateByExampleSelective(record, example);
    }

    @Override
    public int updateByExample(Position record, PositionExample example) {
        return positionMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(Position record) {
        return positionMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Position record) {
        return positionMapper.updateByPrimaryKey(record);
    }
}
