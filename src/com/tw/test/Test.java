package com.tw.test;

import com.tw.domain.Position;
import com.tw.service.PositionService;

import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String filePath = "src/com/tw/resource/input.txt";
        if (args != null && args.length > 0) {
            filePath = args[0];
        }
        List<Position> positionMsg = PositionService.start(filePath);
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int index = sc.nextInt();
            if (index > positionMsg.size() - 1) {
                System.out.println("Can not find " + index);
            } else {
                if (Position.isErrorPos(positionMsg.get(index))) {
                    System.out.println("Error: " + index);
                } else {
                    Position position = positionMsg.get(index);
                    System.out.println(position.getId() + " " + index + " " + position.getX() + " " + position.getY() + " " + position.getZ());
                }
            }
        }
    }
}
