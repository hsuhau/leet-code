package com.hsuhau.medium.service;

import com.hsuhau.medium.MediumApplication;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Measurement;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.OutputTimeUnit;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.annotations.TearDown;
import org.openjdk.jmh.annotations.Threads;
import org.openjdk.jmh.annotations.Warmup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.concurrent.TimeUnit;

@SpringBootTest(classes = MediumApplication.class)
@ExtendWith(SpringExtension.class)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Thread)
@Warmup(iterations = 10, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(1)
@Threads(2)
public class AddThreeNumbersTestBenchmark {
    @Autowired
    private AddThreeNumbers addThreeNumbers;

    private ConfigurableApplicationContext context;

    public static void main(String[] args) throws Exception {
        org.openjdk.jmh.Main.main(args);
    }

    @Setup(Level.Trial)
    public void setup() {
        // 启动Spring容器并获取上下文
        context = SpringApplication.run(SpringConfig.class);
        // 手动注入依赖
        context.getAutowireCapableBeanFactory().autowireBean(this);
    }

    @TearDown(Level.Trial)
    public void tearDown() {
        // 关闭Spring容器
        if (context != null) {
            context.close();
        }
    }

    @Test
    @Benchmark
    public void threeSum() {
        List<List<Integer>> actual = addThreeNumbers.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> expect = List.of(
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        );
        Assert.assertEquals(expect, actual);
    }

    @Test
    @Benchmark
    public void threeSum_set() {
        List<List<Integer>> actual = addThreeNumbers.threeSum_set(new int[]{-1, 0, 1, 2, -1, -4});
        List<List<Integer>> expect = List.of(
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        );
        Assert.assertEquals(expect, actual);
    }

    @Configuration
    static class SpringConfig {
        @Bean
        public AddThreeNumbers myService() {
            return new AddThreeNumbers();
        }
    }
}