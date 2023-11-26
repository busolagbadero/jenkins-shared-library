#!/usr/bin/env groovy
package vars

import com.example.Docker


def call(String imageName) {
    return new Docker(this).dockerPush(imageName)
}

