package jhctv.backend.service;

import jhctv.backend.domainmodel.TVListModel;
import org.springframework.stereotype.Component;

@Component
public class GetTVListOutputEntityFactory {
    public static GetTVListOutputEntity create(TVListModel tvListModel) {
        String test = tvListModel.getTest().getTest();
        GetTVListOutputEntity getTVListOutputEntity = new GetTVListOutputEntity(test);
        return getTVListOutputEntity;
    }
}
