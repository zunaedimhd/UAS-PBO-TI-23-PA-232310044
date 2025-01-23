package com.projectuas;

import java.util.ArrayList;
import java.util.List;

public class ExpressionDAO {
    private List<Expression> expressionList = new ArrayList<>();

    public void saveExpression(Expression expression) {
        expressionList.add(expression);
        System.out.println("Saved expression: " + expression.getExpression() + " for image: " + expression.getImagePath());
    }

    public List<Expression> getAllExpressions() {
        return expressionList;
    }
}