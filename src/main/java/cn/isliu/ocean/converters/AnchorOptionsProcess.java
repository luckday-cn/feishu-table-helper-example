package cn.isliu.ocean.converters;

import cn.isliu.core.converters.OptionsValueProcess;

import java.util.ArrayList;
import java.util.List;

public class AnchorOptionsProcess implements OptionsValueProcess<List<String>> {

    @Override
    public List<String> process() {
        // TODO: 获取锚点数据
        return new ArrayList<String>() {{
            add("1");
            add("2");
            add("3");
        }};
    }
}
