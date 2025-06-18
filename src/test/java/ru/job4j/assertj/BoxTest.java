package ru.job4j.assertj;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class BoxTest {
    Box sphere = new Box(0, 10);
    Box tetrahedron = new Box(4, 6);
    Box cube = new Box(8, 12);

    @Test
    void isThisSphere() {
        String name = sphere.whatsThis();
        assertThat(name).isEqualTo("Sphere");
    }

    @Test
    void isThisTetrahedron() {
        String name = tetrahedron.whatsThis();
        assertThat(name).isEqualTo("Tetrahedron");
    }

    @Test
    void isThisCube() {
        String name = cube.whatsThis();
        assertThat(name).isEqualTo("Cube");
    }

    @Test
    void isThisSphereNumberOfVertices() {
        int vertex = sphere.getNumberOfVertices();
        assertThat(vertex).isEqualTo(0)
                .isNotNull();
    }

    @Test
    void isThisTetrahedronNumberOfVertices() {
        int vertex = tetrahedron.getNumberOfVertices();
        assertThat(vertex).isEqualTo(4)
                .isNotZero();
    }

    @Test
    void isThisCubeNumberOfVertices() {
        int vertex = cube.getNumberOfVertices();
        assertThat(vertex).isEqualTo(8)
                .isNotZero();
    }

    @Test
    void isExitSphere() {
        boolean vertex = sphere.isExist();
        assertThat(vertex).isTrue()
                .isNotNull();
    }

    @Test
    void isExitTetrahedron() {
        boolean vertex = tetrahedron.isExist();
        assertThat(vertex).isTrue();
    }

    @Test
    void isExitCube() {
        boolean vertex = cube.isExist();
        assertThat(vertex).isTrue();
    }

    @Test
    void areaOfSphere() {
        double area = sphere.getArea();
        assertThat(area).isEqualTo(1256D, withPrecision(1D))
                .isNotEqualTo(173D);
    }

    @Test
    void areaOfTetrahedron() {
        double area = tetrahedron.getArea();
        assertThat(area).isEqualTo(62D, withPrecision(1D));
    }

    @Test
    void areaOfCube() {
        double area = cube.getArea();
        assertThat(area).isEqualTo(864D)
                .isNotNegative();
    }
}