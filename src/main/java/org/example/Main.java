package org.example;

import com.theokanning.openai.OpenAiService;
import com.theokanning.openai.edit.EditRequest;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OpenAiService service = new OpenAiService("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");

        EditRequest request = EditRequest.builder()
                .model("text-davinci-edit-001")
                .input("i Jack, I like programn in java, how abt you")
                .instruction("Fix the grammar and spelling mistakes")
                .build();
        service.createEdit(request).getChoices().forEach(System.out::println);

//        int maxRetries = 30;
//        int retryDelayMillis = 60000; // 10 second
//
//        int retryCount = 0;
//        boolean success = false;
//
//        while (retryCount < maxRetries && !success) {
//            try {
//                // Make the API request here
//                service.createEdit(request).getChoices().forEach(System.out::println);
//
//                // If the request is successful, set success to true
//                success = true;
//            } catch (Exception e) {
//                // Handle the exception or error here
//                System.out.println(e);
//                // Increment the retry count
//                retryCount++;
//
//                // Wait for the specified delay before retrying
//                Thread.sleep(retryDelayMillis);
//            }
//        }
//
//        if (!success) {
//            System.out.print("useless");
//        }

    }
}