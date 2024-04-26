package com.app.mealman.services;

import com.app.mealman.entities.Sample;
import com.app.mealman.repositories.SampleRepository;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    private final SampleRepository sampleRepository;

    SampleServiceImpl(SampleRepository testRepository) {
        this.sampleRepository = testRepository;
    }

    @Override
    public Sample insertText(String text) {
        Sample entity = new Sample();
        entity.setText(text);
        return sampleRepository.save(entity);
    }

}
