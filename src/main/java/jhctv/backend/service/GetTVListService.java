package jhctv.backend.service;

import jhctv.backend.domainmodel.TVListModel;
import jhctv.backend.domainmodel.Test;
import jhctv.backend.infrastructure.repository.TVListRepository;
import org.springframework.stereotype.Service;

@Service
public class GetTVListService {
    private final TVListRepository tvListRepository;

    public GetTVListService(TVListRepository tvListRepository) {
        this.tvListRepository = tvListRepository;
    }

    public GetTVListOutputEntity getTVListOutputEntity() {
        Test test = new Test(this.tvListRepository.get());
        TVListModel tvListModel = new TVListModel(test);
        GetTVListOutputEntity getTVListOutputEntity = GetTVListOutputEntityFactory.create(tvListModel);
        return getTVListOutputEntity;
    }
}
