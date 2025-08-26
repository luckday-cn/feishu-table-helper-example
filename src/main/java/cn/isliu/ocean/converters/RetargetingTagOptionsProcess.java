package cn.isliu.ocean.converters;

import cn.isliu.core.converters.OptionsValueProcess;

import java.util.ArrayList;
import java.util.List;

public class RetargetingTagOptionsProcess implements OptionsValueProcess<List<String>> {
    @Override
    public List<String> process() {

        // TODO: 接口获取人群包数据，当前模拟数据
        List<String> retargetingTags = new ArrayList<>();
        retargetingTags.add("人群包1");
        retargetingTags.add("人群包2");
        retargetingTags.add("人群包3");

        return retargetingTags;
    }
}
